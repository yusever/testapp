package ru.info.testapp.controllers;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.InetAddress;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    String date = new SimpleDateFormat("dd.MM.yyyy").format(new Date()),
            computername = InetAddress.getLocalHost().getHostName();
    Long freememory = Runtime.getRuntime().freeMemory(),
            totalmemory = Runtime.getRuntime().totalMemory();

    public HelloController() throws UnknownHostException {
    }

    String input = "1. Текущая дата: " + date + System.getProperty("line.separator") +
            "2. Название компьютера: " + computername + '\n' +
            "3. Свободная память Java: " + freememory + "\n" +
            "4. Всего памяти Java: " + totalmemory;

    @RequestMapping("/")
    @ResponseBody
    String input() {
        return input;
    }
}
