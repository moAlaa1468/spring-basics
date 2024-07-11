package com.hospital.patients.controller;

import ch.qos.logback.core.model.Model;
import com.hospital.alaaOuterPackage.Circle;
import com.hospital.patients.Interfaces.CoachImpl;
import com.hospital.patients.QualifierAndPrimary.Animal;
import com.hospital.patients.bean.Vehicle;
import com.hospital.patients.components.Coach;
import com.ApackageOutsideCoreSpringApplication.OuterClass;
import com.hospital.patients.lazyInitialization.CarModel;
import com.hospital.patients.lazyInitialization.CarOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
 *      ====== The power of the Spring is How to use Annotations ======
 * All what we will use  In this course
 * How to make simple message to the browser
 * How to use annotations from spring framework uaAmer
 * Annotation is the power of Spring and Spring boot
 * */

// هو دا البداية اللي هيبدأ يتعامل مع ال REST Request Like Post Get Put Delete Patch
// اعتبر دا هو ال main وكانك شغال مشروع جافا عادي
// بس هنا ممكن  يكون عندك اكتر من RESTController
@RestController
public class FunRestControllerLikeMain {


    //========================== These are the some properties ========================
    private Coach coach;
    private Circle circle;
    private CoachImpl secondCoach;
    private OuterClass outerClass;
    private Animal cat;
    private Animal dog;
    private Animal animal;
    private CarModel model;
    private CarModel firstCar;
    private CarModel secondCar;
    private CarModel thirdCar;
    private CarOne carOne;

    //============================ Injection level [could be via Constructor or via setters ] ==================
    //Injection via Constructor
    @Autowired
    FunRestControllerLikeMain(Circle circle,
                              @Qualifier("carOne") CarModel firstCar,
                              @Qualifier("carOne") CarModel secondCar,
                              @Qualifier("carOne") CarModel thirdCar
                              ) {
        this.circle = circle;
        this.firstCar = firstCar;
        this.secondCar = secondCar;
        this.thirdCar = thirdCar;
    }

    // This is the injection via setter method [This is the best One or way ]
//    @Autowired
//    public void setSecondCoach(SecondCoach secondCoach) {
//        this.secondCoach = secondCoach;
//    }

    // You have More Than one Class implements the Coach Interface
    // Problems is Which class will be used with the functions Overrided From the interface
    // solution is to use the@Qualifier
    @Autowired
    public void setCoach(@Qualifier("secondCoach") CoachImpl secondCoach) {
        this.secondCoach = secondCoach;
    }

    @Autowired
    public void setCat(@Qualifier("cat") Animal cat) {
        this.cat = cat;
    }

    @Autowired
    public void setDog(@Qualifier("dog") Animal dog) {
        this.dog = dog;
    }

    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Autowired
    public void setCar(@Qualifier("carOne") CarModel model) {
        this.model = model;
    }

    //===================================== usage of the function =================================
    //================= This section  is related to the function That are used ================
    // ================== These function comes from other classes not REstController =====
    // And you need to tell or inject these classes to RESTController through @AutoWired Annotation
    // inorder to be able to use these function or make path for them

    // ====================== You could use some values from application.properties file ==================
    // Via this way uaAmer
    // دا لو انت عاوز تستخدم قيم من ملف ال properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.description}")
    private String teamDescription;

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach is : " + coachName + " , Team name is : " + teamDescription;
    }

    // =============================================== You make some mapping via function in the other classes to use them =====================
    // لازم تروح تعمل mapping
    // لكل الدوال الي هتستخدمها من ال كلاسات الاخري يا علاء
    //

    @GetMapping("/model")
    public String getCar() {
        return model.canWork();
    }

    @GetMapping("/circle")
    public String getCircle() {
        return circle.getArea();
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World This is just the first path in This application";
    }

    // we need to expose this endpoint
    @GetMapping("/workout")
    public String getDailyMessage() {
        return "Run a hard Taks today ";
    }

    @GetMapping("/mohamed-amer")
    public String getHello() {
        return "This is Mohamed Alaa amer is here; ";
    }

    @GetMapping("/second-coach")
    public String printSecondCoach() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/print-info")
    public String multipleCoach() {
        return secondCoach.getDailyWorkout();
    }

    @GetMapping("/cat")
    public String printCat() {
        return cat.makeSound();
    }

    @GetMapping("/dog")
    public String printDog() {
        return dog.makeSound();
    }

    @GetMapping("/animal")
    public String printAnimal() {
        return animal.makeSound();
    }

    @GetMapping("/check")
    public String checkingCars() {
        if (firstCar == secondCar) {
            System.out.println("Two cars have the same reference ");

            return "They are equal ";
        } else {
            System.out.println("They are not equal in  reference ");
            return "They are not equal  because of that @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)   ";
        }
    }

    @Autowired
    public void setCarOne(CarOne carOne) {
        this.carOne = carOne;
    }
}
