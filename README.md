# 1.mvc structure
## 1.1.binding

* 1.1 เรียกใช้  binding

#### app/gradle

```
 dataBinding{enabled true}
```

## 1.2.mvc

* 2.1 สร้าง package รูปแบบ MVC

#### /java/package

```
# activity
# manager
# util
# view 
# fragment
```
* 1.2.2 สร้าง MainApplication.java 

#### java/app

-create 
```
MainApplication.java
```

* 1.2.3 add MainApplication
#### androidmanifest.xml

```
 android:name=".MainApplication"
```

## 1.3.liberry

* 1.3.1 เรียกใช้ liberry
#### settings.gradle
```
 ,':TheCheeseLibrary'  
 
```
   * 1.3.1.1  add library เข้า ไปใน app
   #### app/gradle
   
   ```
   
   implementation project(':TheCheeseLibrary')
   
   ```

* 1.3.2 ใช้ Contextor ที่  MainApplication

#### MainApplication.java 
```

  Contextor.getInstance().init(getApplicationContext()); 
 
```

## 1.4.copy template

* 1.4.1 ก๊อปปี้ template จาก libarry

#### manager

- singletontemplate.java

#### fragment

- fragmenttemplate.java

#### view

- customviewtemplate.java

- customviewgrouptemplate.java

## 1.5.create fragment_main


* 1.5.1 สร้าง fragment เพื่อใช้ แทน activity_main

#### res/layout

create
 - fragment_main.xml 


* 5.2 ก๊อปปี้ template fragmentTemplat เปลี่ยนชื่อเป็น MainFragment

#### fragment

create
 - MainFragment.java


## 1.6.add mainfragment to mainactivity 

* 1.6.1 add fragment เข้าไปที่ activity

#### activity_main.xml

``` 
 	  <FrameLayout
            android:id="@+id/contentContainer"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

```

#### MainActivity.class

```  
  if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
	 
``` 

# 2.MENU

## 2.1.change color 

* 2.1.1. เปลี่ยนสี 
#### values/color

## 2.2.menu

* 2.2.1 สร้างเมนู ที่ activity_main.xml

#### activity_main.xml

 * 2.2.3 add menu
 
    ```
	 <android.support.v4.widget.DrawerLayout   //ครอบทั้งหมด
	```
	
  * 2.2.4 เรียกใช้ menu
      
      ```
	<LinearLayout
            android:background="?attr/colorAccent"
            android:layout_gravity="start"
            android:layout_width="@dimen/drawer_menu_width" //ขนาดของเมนูเปลี่ยนเป็น ID
            android:layout_height="match_parent">
        </LinearLayout>
    ```
    
 * 2.2.5 ทำให้เครื่องขนาดเล็กใช้ได้
 
    ```
   create values-w360dp  = <dimen name="drawer_menu_width">320dp</dimen>
    
                  values = <dimen name="drawer_menu_width">240dp</dimen>
   ```
		      
# 3.Hamburger icon

### 3.1. ประกาศ ID
#### activity_main.xml
* 3.1.1 ประกาศ ID ให้ drawerLayout

	```
	 android:id="@+id/drawerLayout"
	```
## 3.2. add Hamburger
#### MainActivity.java	
* 3.2.1 สร้าง method initInstances(); 
	
* 3.2.2 ประกาศตัวแปร  ActionBarDrawerToggle;
	
	```
	ActionBarDrawerToggle actionBarDrawerToggle;
	```
####  values/string.xml
* 3.2.3  ประกาศตัวแปรที่ values/string
	```
	  <string name="open_drawer">Open Menu</string>
	  <string name="close_drawer">Close Menu</string>
	```
#### MainActivity.java	
* 3.3.4 new ActionBarDrawerToggle
	```
	    actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                binding.drawerLayout,R.string.open_drawer,R.string.close_drawer
        );
       
		
	```
	
* 3.3.5 addDrawerListener
	
	```
	 binding.drawerLayout.addDrawerListener(actionBarDrawerToggle);
	```
	
* 3.3.6  setHomeButtonEnable 
	
	```
		getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
	```
	
*  3.3.7 เข้าถึง ActionBar 
	```
	 @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState(); }
	```
*  3.3.8 เปลี่ยน icon menu
	```
	 @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }
	```
 * 3.3.9 ทำให้ button menu กดได้ 
	
	 ```
	@Override
  	  public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        return true;
        return super.onOptionsItemSelected(item);
    }	 
	```
	 
	 

3#----------------------------------------------------------------
4#----------------------------------------------------------------
5#----------------------------------------------------------------
6#----------------------------------------------------------------

