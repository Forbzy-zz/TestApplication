# TestApplication

Username: Administrator

Password: 

In order to start Appium
Select the android studio icon on the taskbar at the bottom of the screen. (The purple one) 

In order to start Android Studio
Select the android studio icon on the taskbar at the bottom of the screen. (The green one) 

In order to start UIAutomatorViewer 
Open CMD or command line
- Click on the ‘Search Windows’ button in the bottom left corner that looks like a magnifying glass. 
- Type in either CMD or command prompt 
- once open you should run the below commands without the quotes and close the terminal.
- “cd C:\Users\Administrator\AppData\Local\Android\Sdk\tools\bin”
- “uiautomatorviewer.bat”

Create Project

- Go to Android Studios and click on File -> Open
- The project is located in the `C:/Users/Administrator/Documents/TestApplication.`
- Navigate here and click on Open.

Check Test script
- On Android Studio you can look at the Project view which will show all the files and folders in your current project. 
- Click on Project near the top left side. 
-Then navigate through your folder structure to locate test files and open them. 
- TestApplication -> app -> src -> main -> com.example.james.testapplication -> WaitTests

Ensure your Emulator is running
- Go to menu at top and click on Tools -> AVD Manager
- Then select the Nexus 5 Emulator and select the pplay button under the Actions column.

Running the tests
- Click on Run from the menu from the top of the screen and Select Run -> WaitTests
