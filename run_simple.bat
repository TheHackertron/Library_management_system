@echo off
echo Compiling Library Management System (Simple Version)...

rem This version assumes JavaFX is in your classpath or you have OpenJFX installed
cd src

rem Try to compile with system JavaFX
javac application\*.java

if %errorlevel% neq 0 (
    echo Compilation failed! 
    echo Please ensure JavaFX is properly installed and in your classpath.
    echo Or update the JAVAFX_PATH in run.bat to point to your JavaFX installation.
    cd ..
    pause
    exit /b 1
)

echo Compilation successful!
echo.
echo Note: To run the application, you need JavaFX runtime.
echo Use the following command with your JavaFX path:
echo java --module-path "path\to\javafx\lib" --add-modules javafx.controls,javafx.fxml application.Main
echo.

cd ..
pause
