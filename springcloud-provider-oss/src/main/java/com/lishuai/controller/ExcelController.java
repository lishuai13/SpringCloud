package com.lishuai.controller;

import com.lishuai.service.ExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lishuai
 * @since 2021-04-14
 */
@Slf4j
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    ExcelService excelService;

    @GetMapping("/toExcel")
    public void prodTest(HttpServletResponse response) throws IOException {
        String fileName = "test-STU.xls";
        String headStr = "attachment; filename=" + fileName;
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", headStr);
        excelService.exportTest(response.getOutputStream(), "test");
    }
}
