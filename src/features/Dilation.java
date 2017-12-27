package features;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ioRelatedClasses.ReadImage;
import ioRelatedClasses.WriteImage;

public class Dilation {
	ReadImage readimage;
	WriteImage writeImage;
	
	//start constructor
	public Dilation(File file) throws IOException{
		readimage=new ReadImage(file);
		writeImage=new WriteImage(readimage);
		DilationMethod();
	}//end constructor
	
	private void DilationMethod() throws IOException{
	/*	double filter [][]=	{ 
				{0, 1},
				{1, 1}
		};
		int filterHeight=2,filterWidth= 2;*/
		double filter [][]=	{ 
		        {0,0,1,0,0},
		        {0,1,1,1,0},
		        {1,1,1,1,1},
		        {0,1,1,1,0},
		        {0,0,1,0,0}
		};
			int filterHeight=5,filterWidth= 5;
		
			
		  for(int y = 0; y < readimage.getHeight(); y++) 
			    for(int x = 0; x < readimage.getWidth(); x++) 
			    { 
			        int v=0; 
			        List<Integer> list= new ArrayList<>();
			        //multiply every value of the filter with corresponding image pixel 
			        for(int filterY = 0; filterY < filterHeight; filterY++) 
			        for(int filterX = 0; filterX < filterWidth ; filterX++) 
			        { 
			            int imageX = (x - filterWidth / 2 + filterX + readimage.getWidth()) % readimage.getWidth(); 
			            int imageY = (y - filterHeight / 2 + filterY + readimage.getHeight()) % readimage.getHeight(); 
			  
			            if(filter[filterX][filterY]==1)
			            {
			            	list.add(readimage.getRGB(imageY, imageX));
			            }
			        } 
			         v=Collections.max(list);
			         Color c= new Color(v);
			         writeImage.write(c.getBlue(), c.getGreen(), c.getRed());
			    } 
				
		}
	}

