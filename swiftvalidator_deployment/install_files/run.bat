@echo off
setLocal EnableDelayedExpansion
set CLASSPATH="
for /R ./../lib %%a in (*.jar) do (
  set CLASSPATH=!CLASSPATH!;%%a
)
set CLASSPATH=!CLASSPATH!";.\..\etc

start "SwiftValidator" javaw -Dsun.java2d.noddraw=true -classpath %CLASSPATH% net.uglobal.gui.Application
