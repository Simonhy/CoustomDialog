## DialogDemo
  自定义对话框
  构造函数有两种,一种是带有标题的,可以自定义标题 第二种带有编辑框的.可以设置其确定/取消的按钮.
## 样式图片
  
## 使用
   DialogUtils. DialogUtil.createComfirmDialog(this); 
   或者DialogUtil.createOnlyTitleComfirmDialog(this);
   设置了按钮的监听,表示有两个按钮,默认否/是,如果没有设置监听,表示只有一个确定按钮.
 
## 需要修改按钮的话
    comfirmDialog.setNegativeButtonText("取消");
    comfirmDialog.setPositiveButtonText("确定");
    还可以设置标题
    comfirmDialog.setDialogTitle("标题");
    
# 使用方式:
 Step 1
 Add it in your root build.gradle at the end of repositories:
## 
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 Step 2. Add the dependency
## 
	dependencies {
	        compile 'com.github.Simonhy:DialogDemo:v1.0'
	}
