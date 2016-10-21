![Bombarding](https://cdn0.vox-cdn.com/thumbor/o1W7WSjwm46bEB5S0PBbuv3Tj1Q=/148x0:1768x1080/1280x854/cdn0.vox-cdn.com/uploads/chorus_image/image/47413330/the-simpsons-tv-series-cast-wallpaper-109911.0.0.jpeg)

# Fun-Computer-Graphics

These programs were built in Java for Professor Chen's 400 level Theory of Computer Graphics Course at Butler University.

Clone or download repository: https://github.com/Bombarding/Fun-Computer-Graphics.git


```
Open Eclipse
Select Workspace
Extract Zip Folder to Workspace or Dektop or wherever
Right Click in Project Manager --> Import --> Files location
```


All programs run as is. In order to Run Squares|SquaresAnim (ManySq or ManySqAnim), please go to the top toolbar in eclipse --> 

```
Run --> Run Configs --> 2nd tab "Arguements" 
//n=10, k=50, q=0.1
n=rows, k=colums, q=line spacing
```



#**REFERENCE**

Animations are handled by the following try/catch exception
- Bigger Number, slower print. Smaller Number, Faster Print.



- Program will not close until ALL lines are printed. Remember to hit the Stop button above the console
```
try 
{
  TimeUnit.MICROSECONDS.sleep(100000);
} catch (InterruptedException e) 
{
  e.printStackTrace();
}
```
