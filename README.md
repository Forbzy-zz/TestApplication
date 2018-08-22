# DevOps Playground - Android Studio and Appium

## Overview

In this meetup, we are going to take an existing android application and run tests agaisnt it. We'll use the appium UIAutomator to find the DOM elements on an application. We'll then extract the tags and use them within our test code to allow our tests to locate the elements and do checks agaisnt them. 

## Note on terminology
I'm going to describe a few terms such as Appium, ADB, Emulator so that we are all on the same page.

### What is Appium?
APPIUM is a freely distributed open source mobile application UI Testing framework. Appium allows native, hybrid and web application testing and supports automation test on physical devices as well as an emulator or simulator both. It offers cross-platform application testing, i.e. single API works for both Android and iOS platform test scripts. Appium supports all languages that have Selenium client libraries like- Java, Objective-C, JavaScript with node.js, PHP, Ruby, Python, C#, etc.

### How Appium Works?
 
Appium is an 'HTTP Server' written using a Node.js platform and drives iOS and an Android session using Webdriver JSON wire protocol. Hence, before initializing the Appium Server, Node.js must be pre-installed on the system.
When Appium is downloaded and installed, then a server is set up on our machine that exposes a REST API.
It receives connection and command request from the client and executes that command on mobile devices (Android / iOS).
It responds back with HTTP responses. Again, to execute this request, it uses the mobile test automation frameworks to drive the user interface of the apps. A framework like:-
Apple Instruments for iOS (Instruments are available only in Xcode 3.0 or later with OS X v10.5 and later)
Google UIAutomator for Android API level 16 or higher
Selendroid for Android API level 15 or less
 
### What is An Emulator?
An Emulator is an application that emulates real mobile device software, hardware and operating systems, allowing us to test and debug our application. It is generally provided by device manufacturer. Mobile emulators are free and provided as a part of SDK with each new OS release. As a developer or a tester, you can configure the emulator closely resemble the devices on which you plan to deploy your application.

## Credentials for your instance
Username: Administrator

Password: 

## Start Appium
Select the android studio icon on the taskbar at the bottom of the screen. (The purple one) 

## Starting Android Studio
Select the android studio icon on the taskbar at the bottom of the screen. (The green one) 

## Starting UIAutomatorViewer 
Open CMD or command line
- Click on the ‘Search Windows’ button in the bottom left corner that looks like a magnifying glass. 
- Type in either CMD or command prompt 
- once open you should run the below commands without the quotes and close the terminal.
- “cd C:\Users\Administrator\AppData\Local\Android\Sdk\tools\bin”
- “uiautomatorviewer.bat”

## Create Project
- Go to Android Studios and click on File -> Open
- The project is located in the `C:/Users/Administrator/Documents/TestApplication.`
- Navigate here and click on Open.

## Check Test script
- On Android Studio you can look at the Project view which will show all the files and folders in your current project. 
- Click on Project near the top left side. 
-Then navigate through your folder structure to locate test files and open them. 
- TestApplication -> app -> src -> main -> com.example.james.testapplication -> WaitTests

## Ensure your Emulator is running
- Go to menu at top and click on Tools -> AVD Manager
- Then select the Nexus 5 Emulator and select the pplay button under the Actions column.

## Running the tests
- Click on Run from the menu from the top of the screen and Select Run -> WaitTests
