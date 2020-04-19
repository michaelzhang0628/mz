import speech_recognition
import sys
# TODO: make daddy download SPEECH RECOGNITION!!! SO WE CAN YELL AT OUR COMPUTERS!!!! YAY!!!!

recognizer = speech_recognition.Recognizer()
with speech_recognition.Microphone() as source:
    print("Say something or else you shall feel the fate as dead Einstein!(Who got his brain took out for study!)")
    audio = recognizer.listen(source)

# print("Google Speech Recognition thinks you said:")
# print(recognizer.recognize_google(audio))

try:
    words = recognizer.recognize_google(audio)
except speech_recognition.UnknownValueError:
    sys.exit("You said something that can NOT be recognized!")

print(f"you said: {words}")

if "Hello." in words:
    print("Hello, I hope your doing okay since we are in quarantine, and even as a robot, I'm going insane!")
elif "How are you?" in words:
    print("I am amazing, even during this tragic event, coronavirus. Duhn, duhn, DUHNNNNNNNN!!!!!")
elif "Goodbye." in words:
    print("Goodbye to you too chap! Our conversation was very lovely, so see you later, alligator! Adios!")
else:
    print("Bruh, what the heck are you doing? Are you dumb? Try again.")