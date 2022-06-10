# What are the different types of appilications on mobiles?
1. Web App (Browser): Browser is needed to use an app,  internet is needed
2. Native app: Anything which is inbuilt in the phone, it will connect to browser
    1. Camera
    2. Calculator
    3. File manager
    4. Contacts
    5. photos
    6. Games
3. Hybrid app: an app which is a combination of native and web application
    1. facebook
    2. Instagram
    3. amazon
    4. flipkart
    5. myntra
    6. games
    7. WhatsApp

# General Knowledge for Native Apps
1. can we install a native application from the play store?
    1. yes
2. Whenever we install an app in a phone, what is the extension of the file in the phone?
    1. .apk
3. what will be the extension if you are using iOS?
    1. .ipa and .app
4. extension of an android app:
    1. .apk
5. install the api demo apk file into the device by pasting the file into platform tools
6. platform tool → cmd → adb install “app name.apk”
7. we then get into the cmd prompt and install the device using `adb install "native.apk"`
8. restart the phone (long press power button and click restart)

## How to  inspect an element in a native app
1. from the path
2. from appium

### From the path
1. navigate to the sdk path
2. open the application on the emulator
3. open the tools → open the bin → uiautomatorviewer → click on the second icon from the left

### from appium
1. click on the inspect
2. use the automatic server
3. then add deviceName (emulation name)
4. add platformName (android)
5. add the appPackage (inspect with apk, copy and paste it)
