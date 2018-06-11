# lab_Application_v1

1#MVC---------------------------------------------------------------
========1.binding=============================

//1.1 เรียกใช้  binding

-" dataBinding{enabled true} " --> gledle

========2.mvc=================================

//2.1 สร้าง package รูปแบบ MVC

-acyivity -manager -util -view -fragment

//2.2 สร้าง MainApplication 

-create MainApplication.class

-add android:name=".MainApplication"  --> androidmanifest

========3.liberry=============================

//3.1 เรียกใช้ liberry

-" ,':TheCheeseLibrary'  " ->  add library

//3.2 ใช้ Contextor ที่  MainApplication

- MainApp,onCreate --> { Contextor.getInstance().init(getApplicationContext()); }

========4.copy template=======================

-singleton-fragment-customview-customviewgroup

========5.create fragment_main=

create fragment_main.xml --> layout

create MainFragment.class --> fragment

========6.add mainfragment to mainactivity ====

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

2#MENU------------------------------------------------------------

========1.change color=========

========2.menu=================

activity_main

    2.1 add menu
    
	<android.support.v4.widget.DrawerLayout
  
  	#####################################################
    
	<LinearLayout
            android:background="?attr/colorAccent"
            android:layout_gravity="start"
            android:layout_width="@dimen/drawer_menu_width" // --> values = 240dp    values-w360dp = 320dp
            android:layout_height="match_parent">
        </LinearLayout>
        
       #########################################################
       
3#----------------------------------------------------------------
4#----------------------------------------------------------------
5#----------------------------------------------------------------
6#----------------------------------------------------------------
