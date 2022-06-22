package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getAllStudent(){
        return "all_students";
    }

    @GetMapping("/student")
    public String getStudentPage(){
        return "student";
    }

    @GetMapping("/hr_info")
    public String getInfoForHr(){
        return "view_hr";
    }

    @GetMapping("manager_info")
    public String getInfoMenegers(){
        return "view_maneger";
    }
}
