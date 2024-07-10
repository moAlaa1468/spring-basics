package com.hospital.patients;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.hospital.alaaOuterPackage",
                "com.hospital.patients",
                "com.ApackageOutsideCoreSpringApplication"
        }
)

public class MainClass {

    /*
     *
     * What is the injection Type should you use
     * As you like [ Setter Or constructor Injection ] According to your Project
     * Constructor => Injection for dependencies
     * Setter      => Injection for Optional Dependencies
     *---------------------------
     * video : 43
     *  What about field Injection uaAlaa
     *  It is not recommended to use Field Injection at all uaAmer because it makes it harder for unit Test
     *  But use the constructor and Setter
     *-----------------------------
     * video 44 :
     * If you have multiple implementation which one you will inject or Spring will inject which One
     * Task make more than one interface and implements  them try to inject them to your app
     * solution is to use @Qualifier
     * And this annotation could be used with setter and constructor injection
     * Make simple example
     * --------------------------------
     * video 47:
     * What is the Primary Annotation And how to use it
     * If you have multiple class implements the same interface
     * You need to tell spring that This is one that I mean in the RESTController
     * by adding @Primary  ==> see dog and Cat example uaAmer
     * But you have One class could be primary
     * ==> You could use Primary and Qualifier But Qualifier is higher priority
     * ==> the best way is to use Qualifier Annotation
     *-------------------------------------
     * video 48 :
     * Lazy Initialization   [ عملي الدنيا واضحة ]
     * in the application.properities add This line spring.main.lazy-initialization=true
     * when you make four class implements an interface
     * after AutoWired the parent or AutoWired the interface The Four Constructors are initialized
     * But lazy will stop the child you specify from being initialized Unless you do that
     * You could make this in the Global configuration file when you have multiple classes
     * ===> Advantages : You only create objects as needed
     * ------------------------------------
     * video 52 and 53 :
     * checking the same Scope uaAmer :
     * @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
     * Beans Scopes How to check that if Two objects[beans] have the same reference or not
     * You could do that via the Scope
     * ==> You could create more than  new object from the same class By using @Scope
     *--------------------------------------------------
     *  video 54  :
     *  What is the bean life cycle uaAmer
     *  Line is --> Bean Instantiated -> Dependencies Injected -> Internal Spring Processing -> You Custom Init Method
     *  You could add some code during bean Initialization or Destruction  Like normal Object uaAmer
     *  During Initialization use Annotation => @PostConstruct
     *  During destruction use Annotation =>    @PreDestroy
     *----------------------------------------------------
     * video 57 :
     * The concept of Spring :
     * Development Process :
     * 1- Create @Configuration Class
     * 2- Define @Bean method to configure the bean
     * 3- Inject the bea into our controller
     * ==> Why not use @Component instead of @bean ==> because in some cases you will need
     * to use the This class marked as @Bean in another Spring application after generating the jar file
     * This is called third Party usage
     *
     *
     *
     *
     *
     *  As you see everything is just an Annotation
     *
     * */


    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
        System.out.println("This is just the main Class ua/emr ");
    }
}

