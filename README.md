# Work To Do


Work Todo is a simple Android application 📱 which shows the work to perfrom in a list using Room Database and Recycler View
# About

- It simply loads the save work assigned to the database.
- It is offline capable(Locally sored using room)


# Built With 🔨
 - ```Kotlin``` - First class and official programming language for Android development.
 - ```Android Architecture Components``` - Here are the roles of every component:

    - ```Model``` — the data layer. Responsible for handling the business logic and communication with the network and database layers.
    - ```View ```— the UI layer. Displays the data and notifies the Presenter about user actions.
    - ```Presenter``` — retrieves the data from the Model, applies the UI logic and manages the state of the View, decides what to display and reacts to user input notifications from the View.
    
    Since the View and the Presenter work closely together, they need to have a reference to one another. To make the Presenter unit testable with JUnit, the View is abstracted and an interface for it used. The relationship between the Presenter and its corresponding View is defined in a ```Contract``` interface class, making the code more readable and the connection between the two easier to understand.
- ```Recycler view``` - RecyclerView is a ViewGroup added to the android studio as a successor of the GridView and ListView. It is an improvement on both of them and can be found in the latest v-7 support packages.
- ```Data class``` - We frequently create classes whose main purpose is to hold data. In such a class some standard functionality and utility functions are often mechanically derivable from the data. In Kotlin, this is called a data class and is marked as data : data class User(val name: String, val age: Int)
- ```Room``` -    The Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite. Room is part of the Android Architecture Components presented in the Google I/O 2016. It is not an ORM, it is a whole library that allows us to create and manipulate SQLite databases easier, by using annotations we can define our databases, its tables and operations; Room will automatically translate these annotations into SQLite instructions/queries to perform the correspondent operations into the DB engine.

# Credits
---
Thanks to
- ```Android Kotlin Fundementals```- For awesome Codelabs on using Kotlin to build Android apps using best practices

#  Developed By
```Avinash Kumar```
- Twitter (https://twitter.com/aviavinashkravi)
- LinkedIn (https://www.linkedin.com/in/avinash-kumar-910957141/)

# License
MIT License

Copyright (c) 2020 Avinash Kumar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
