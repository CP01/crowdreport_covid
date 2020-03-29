package controller;

/**
 * @author Charchit [charchit.patodi@gmail.com]
 * Part of Coronathon
 * on 29/03/20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.ReportService;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;
}
