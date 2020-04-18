from PIL import Image, ImageFilter

before = Image.open("blurred.jpg")
after = before.filter(ImageFilter.SHARPEN)
after.save("sharp.jpg")