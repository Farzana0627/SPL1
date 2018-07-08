# SPL1
## Image processing algorithms

Image processing has always been a technological demand. The applications are very far reaching making it an essential research area as well.
This project implements 25 algorithms of image processing. The names of the algorithms match with the names of the .java file in the features folder, hence self-explanatory.

## Implementation Detail

This project follows a three tire architecture. Since this is an initial academic project, the importance of raw coding was mendatory.
So, the .bmp image files are read as raw file in java taking into account all the metadata and headers they contained. After that, only
the pixel data are sent to features.io package package and then passed through algorithms to produce the expected processed image. Later, using 
Graphical User Interface, the processed image is displayed.


## Limitations

1. Only .bmp files can be taken as input images.
2. Image file reading takes much time since it is read as a raw file.
