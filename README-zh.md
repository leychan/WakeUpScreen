* [English Version](https://github.com/SymeonChen/WakeUpScreen/blob/master/README.md)
* [中文版](https://github.com/SymeonChen/WakeUpScreen/blob/master/README-zh.md)

# 通知亮屏（WakeUpScreen）

这是一个可以使手机在接收到**通知**时**点亮屏幕**的 Android APP。

## 简介

### 应用截图

![](https://blog-1252276648.cos.ap-shanghai.myqcloud.com/WakeUpScreen/wake_up_screen_couple_20190414.png)

### 为什么要开发该项目

收到通知时点亮屏幕，是大部分厂商的系统里都集成了的功能，但直到如今仍有不支持该功能的热门设备，如搭载 OneUI 的三星S系列、Note系列机型。对作者本人来说，该功能的缺失十分影响日常使用体验，因此在三星官方正式推出该功能之前，本应用会持续维护。

### 该项目与其他竞品有何区别

在Android系统中，**读取所有应用的通知**属于特殊权限，鉴于对隐私和安全的考量，本作者无法放心将该权限交给**非开源应用**及**有联网权限**的应用，所以决定自己实现，因此本应用：

1. 开源，所有代码可自由查看
2. 无联网权限，保护隐私

### 除了通知亮屏，还有哪些功能

#### 已完成的功能：

1. 自定义亮屏时长，如 1秒、2秒、5秒
2. 口袋防误触，当手机放在口袋里时不会触发亮屏
3. 多语言适配

#### 开发中的功能：

1. 分应用过滤
2. 快捷开关
