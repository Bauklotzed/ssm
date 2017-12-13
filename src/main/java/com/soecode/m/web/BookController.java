package com.soecode.m.web;

import com.soecode.m.dto.AppointExecution;
import com.soecode.m.dto.Result;
import com.soecode.m.entity.Book;
import com.soecode.m.enums.AppointStateEnum;
import com.soecode.m.exception.NoNumberException;
import com.soecode.m.exception.RepeatAppointException;
import com.soecode.m.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Zed on 2017/12/12.
 */

@Controller
@RequestMapping("/book") //url: /模块/资源/{id}/细分/seckill/list
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model){
        List<Book> list = bookService.getList();
        model.addAttribute("list", list);
        // list.jsp + model = ModelAndView
        return "list";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model){
        if(null == bookId){
            return "redirect:/bool/list";
        }
        Book book = bookService.getById(bookId);
        if(null == book){
            return "redirect:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";
    }

    //ajax json
    @RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"
    })
    @ResponseBody
    private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId,
                                             @RequestParam("studentId") String studentId){

        if(null == studentId || studentId.equals("")){
            return new Result(false, "学号不能为空");
        }
        Long studentI = Long.parseLong(studentId);
        AppointExecution execution = null;
        try{
            execution = bookService.appoint(bookId, studentI);
        }catch (NoNumberException e1){
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        }catch (RepeatAppointException e2){
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        }catch (Exception e){
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);

    }

}


















