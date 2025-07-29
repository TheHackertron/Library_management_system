@echo off
echo Compiling Library Management System...

rem Set JavaFX path - adjust this path according to your JavaFX installation
set JAVAFX_PATH="C:\Program Files\Java\javafx-sdk-21.0.1\lib"

rem Create output directory
if not exist out mkdir out

rem Compile without modules first (simpler approach)
cd src
javac --module-path %JAVAFX_PATH% --add-modules javafx.controls,javafx.fxml application\*.java

if %errorlevel% neq 0 (
    echo Compilation failed!
    cd ..
    pause
    exit /b 1
)

echo Compilation successful!
echo Running Library Management System...

rem Run the application
java --module-path %JAVAFX_PATH% --add-modules javafx.controls,javafx.fxml application.Main

cd ..
pause
