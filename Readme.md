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
```
try 
{
  TimeUnit.MICROSECONDS.sleep(100000);
} catch (InterruptedException e) 
{
  e.printStackTrace();
}
```
