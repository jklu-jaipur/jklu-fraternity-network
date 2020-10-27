import pyttsx3 as tts
import subprocess as sp

tts.speak("Hello world")
q = input()
sp.getoutput(q)
