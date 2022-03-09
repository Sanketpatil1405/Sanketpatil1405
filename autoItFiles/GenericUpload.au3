;Wait for 10 sec to upload the popup
Local $winID =WinWait("[CLASS:#32770]","",2000)
;set focus in the file name field
ControlFocus($winID,"","Edit1")
;Enter text inside the file name field
ControlSetText($winID,"","Edit1",$cmdLine[1])
;click on the open button
ControlClick($winID,"","Button1")
