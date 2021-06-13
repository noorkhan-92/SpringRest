package com.example.controller;

import com.example.entities.Student;
import com.example.entities.Course;
import com.example.entities.User;
import com.example.services.CourseService;
import com.example.services.StudentService;
import com.example.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private CourseService courseService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private StudentService studentService;

    //also we can use @GetMapping(..., HttpMethod.Get)
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    //@RequestParam gets the parameter passed in url id url?parm=value
//    public String helloWorld(@RequestParam(value = "name", defaultValue = "World"), String name) {
//        return "Hello " + name;
//    }
//    @GetMapping("/")
//    public String helloWorld1() {
//        return "Hello World!";
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String helloWorld2(@RequestBody String name) {
//        return "hello" + name;
//    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.studentService.getStudents();
    }
    
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }
    
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }
    
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable long userId){
        return this.userService.getUser(userId);
    }
    
    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
    
}
