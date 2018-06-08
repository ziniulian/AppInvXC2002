@echo off
xcopy L:\Doc\SVN\XC2002\src\XC2002\app\src\main L:\Doc\Git\AppInvXC2002\app\src\main\ /S
xcopy L:\Doc\SVN\XC2002\src\XC2002\app\libs L:\Doc\Git\AppInvXC2002\app\libs\ /S
copy L:\Doc\SVN\XC2002\src\XC2002\app\build.gradle L:\Doc\Git\AppInvXC2002\app
pause
