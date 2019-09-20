# Web Test Framework with Serenity and Cucumber 4

### The project directory structure
The project has build scripts for Gradle, and follows the standard directory structure used in most Serenity projects:

```Gherkin
src
  + main
    + java                            
      + com.hymnai.testframework.web  
        + elements                    Page Elements
        + pages                       Generic Pages
        + steps                       Generic Steps
        + util                        Util class 
  + test
    + java                          Test runners and supporting code
    + resources
### Application code
```

These packages generally contain application code. 

If you are writing a reusable test library, you can also place reusable test components such as Page Objects or Tasks here.