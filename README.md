# smackoverflow

This system is designed to be used by three different users: a Course Director, an Administrator, and a PTT Director. 

The log in screen will allow a user to log in with their ID number. The first digit of the ID number will tell the system what type of user is logging in, and thus which GUI screen to show them.

An ID number starting with a 1 will tell the system that the user is a Course Director, and so the CourseDirectorView screen will be shown to the user. In this screen the user will be able to enter the course ID of any classes which need teacher cover. Once this is complete, the close button will close the CourseDirectorView window.

An ID number starting with a 2 will tell the system that the user is an Administrator, and so the AdminView screen will be shown to the user. In this screen the user will see the list of courses requiring cover, previously entered by the Course Director. (Note that if a Course Director has not previously entered a list of courses in to the system during this run, this screen will not show any classes to be filled.) 
The Administrator will be able to select each class, and then select a teacher to be assigned to cover the class. Once every class has had a teacher assigned to it, the Administrator can click the "Send To Training" button. This training will happen outside our system. The close button will close the AdministratorView window.

An ID number starting with a 3 will tell the system that the user is a PTT Director, and so the PTTDirectorView screen will be shown to the user. In this screen the user will be presented with the list of courses and the teachers that have been assigned to cover them. The PTT Director will be able to approve each of these assignments, using a checkbox / approve button. Once this is complete, the close button will close the CourseDirectorView window. 

The list of teachers and the course that they are covering will be written to the permenant file. In future releases of the application, this fill will be able to be viewed again by the PTT Director upon log in (provided it is not overwriten first).
In future realeases we would also like to implement a database, so that information could be saved along the way. Further details can be found in our Team Report.
