from gtts import gTTS

file = open("book.txt", "r", encoding="utf-8")
my_text = file.read()
file.close()

tts = gTTS(text=my_text, lang="es")
tts.save("my_audio.mp3")