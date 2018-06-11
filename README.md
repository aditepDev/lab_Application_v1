# lab_Application_v1

# 1.MVC
* 1.binding

//1.1 เรียกใช้  binding

-" dataBinding{enabled true} " --> app/gradle

* 2.mvc

//2.1 สร้าง package รูปแบบ MVC

-activity -manager -util -view -fragment

//2.2 สร้าง MainApplication 

-create MainApplication.class

-add android:name=".MainApplication"  --> androidmanifest

* 3.liberry

//3.1 เรียกใช้ liberry

-" ,':TheCheeseLibrary'  " ->  add library

//3.2 ใช้ Contextor ที่  MainApplication

- MainApp,onCreate --> { Contextor.getInstance().init(getApplicationContext()); }

* 4.copy template

//4.1 ก๊อปปี้ template จาก libarry

-singleton -fragment -customview -customviewgroup

* 5.create fragment_main

//5.1 สร้าง fragment เพื่อใช้ แทน activity_main

create fragment_main.xml --> layout  xml

//5.2 ก๊อปปี้ template fragmentTemplat เปลี่ยนชื่อเป็น MainFragment

create MainFragment.class --> fragment java

* 6.add mainfragment to mainactivity 

// add fragment เข้าไปที่ activity

-MainActivity

  if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
	
-activity_main.xml

 	  <FrameLayout
            android:id="@+id/contentContainer"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>


# 2.MENU

* 1.change color

//1. เปลี่ยนสี ที่  values-->color 

* 2.menu

//2.1 สร้างเมนู ที่ activity_main.xml

activity_main

    //2.1 add menu
    
	 <android.support.v4.widget.DrawerLayout   //ครอบทั้งหมด
	 
  	#######################################################
	
      //เรียกใช้ menu
      
	<LinearLayout
            android:background="?attr/colorAccent"
            android:layout_gravity="start"
            android:layout_width="@dimen/drawer_menu_width" //ขนาดของเมนูเปลี่ยนเป็น ID
            android:layout_height="match_parent">
        </LinearLayout>
    
    #########################################################
    
    //2.2 ทำให้เครื่องขนาดเล็กใช้ได้
    
    // create values-w360dp  = <dimen name="drawer_menu_width">320dp</dimen>
    
                      values = <dimen name="drawer_menu_width">240dp</dimen>
		      
* 3.Hamburger icon

3#----------------------------------------------------------------\n
4#----------------------------------------------------------------\n
5#----------------------------------------------------------------\n
6#----------------------------------------------------------------\n

