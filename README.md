# SPL1

## Image processing algorithms

Image processing has always been a technological demand. The applications are very far reaching making it an essential research area as well. This project implements 26 algorithms of image processing. The names of the algorithms match with the names of the .java file in the features folder, hence self-explanatory.

## Implementation Detail

This project follows a three tire architecture. It is the composition of reading input image, algorithm processing and user interface. 
Since this is an initial academic project, the importance of raw coding was mendatory. Raw image files are read by the ReadImage class of ioRelatedClasses package. After that, only the pixel data are sent to features package and then passed through algorithms to produce the expected processed image. Later, using Graphical User Interface, the processed image is displayed.

### Input Output Related Classes

The ioRelatedClasses package consists of both the input and output section of the project. The ReadImage class reads .bmp image files  as raw files in java taking into account all the metadata and headers they contained. The WriteImage class is called by the GUI class in UserInterFace package for writing the image pixels.

### Features

This package implements the algorithms one by one in their respective .java files. Except the cartoonfilter.java and oilpaint.java files, all other files contain implemented algorithms. The images are sent to the classes for processing and then these classes return the processed images.
 
### User Interface

This package contains only one class in GUI.java that calls the graphics packages of Java and displays the processed image in the graphical panel. 

## Limitations

1. Only .bmp files can be taken as input images.
2. Image file reading takes much time since it is read as a raw file.
