Task 1:
Create a Maven project and add required dependency of spring-context 5.1.4.RELEASE
Create a Main class in package com.stackroute and two Spring Beans – com.stackroute.domain.Movie, and com.stackroute.domain.Actor in
package com.stackroute.domain.
com.stackroute.domain.Actor has two String properties, name and gender, and an age property of type int.
An com.stackroute.domain.Actor can be initialized with the three properties via the corresponding setter methods. Use
property based injection in the bean definition file (beans.xml)
com.stackroute.domain.Movie “has a” com.stackroute.domain.Actor that can be initialized via the corresponding setter method. Use property
based object injection in the bean definition file (beans.xml)
The Main class looks up com.stackroute.domain.Movie bean via three ways to print out actor information:
1. Using XmlBeanFactory
2. Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
3. Using ApplicationContext
Create a spring-xml-demo repo and push the code to master branch.
Task 2:
From the master branch of spring-xml-demo repo create a constructor-injection
branch.
Add constructor to the com.stackroute.domain.Actor class to initialize with name and gender, and age
Create three beans of type com.stackroute.domain.Actor in the bean definition file.
Use constructor-based injection in the bean definition file (beans.xml) to inject property values in
each of the three beans via name, index, and type respectively.
For the com.stackroute.domain.Movie bean, use constructor based object injection in the bean definition file
(beans.xml) to inject an com.stackroute.domain.Actor bean.
In the Main class, look up com.stackroute.domain.Movie bean using ApplicationContext and print out Author
information.
Use the same ApplicationContext to again look up the same com.stackroute.domain.Movie bean.
Print out the equality result of the two com.stackroute.domain.Movie beans.
System.out.println(beanA==beanB);
Change the scope of the com.stackroute.domain.Movie bean in beans.xml to prototype and run the application again.
Note the output.
Replace id of the com.stackroute.domain.Movie bean with name having two values, like this:

<bean name=”MovieA, MovieB” ........>
Update the code in Main to get the com.stackroute.domain.Movie bean by its two different name.
Push the code to constructor-injection branch.

Task 3:
From the constructor-injection branch of spring-xml-demo repo create a
autowire-xml branch.
For the com.stackroute.domain.Movie bean, delete the constructor based object injection in the bean definition file
(beans.xml) that injects an com.stackroute.domain.Actor bean.
Use autowire byName in the com.stackroute.domain.Movie bean to inject an com.stackroute.domain.Actor bean.
Run the application.
Create another com.stackroute.domain.Movie bean and try autowire byType.
Run the application and note the exception thrown.
Fix the com.stackroute.domain.Movie bean by removing autowire byType and using constructor injection instead.
Push the code to autowire-xml branch.

Task 4:
From the autowire-xml branch of spring-xml-demo repo create an aware-interface
branch.
Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
com.stackroute.domain.Movie class and print out their results.
Push the code to aware-interface branch.

Task 5:
From the aware-interface branch of spring-xml-demo repo create a bean-lifecycle
branch.
Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
InitializingBean and DisposableBean.
Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
Run the application and observe the result.

Add two methods customInit() and customDestroy() to the BeanLifecycleDemoBean
class and print out custom messages.
In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()
and customDestroy() methods to be called.
Run the application.
Push the code to bean-lifecycle branch.

Task 6:

From the bean-lifecycle branch of spring-xml-demo repo create a bean-post-
processor branch.

Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements
BeanPostProcessor
Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
Run the application and observe the result.
Push the code to bean-post-processor branch.