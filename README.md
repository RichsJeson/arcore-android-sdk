=======================================start==========================================

官方声明支持的设备只有Pixel和S8，设备检查是在arcore_client.aar中的SupportedDevices.class，
是根据设备的Build.FINGERPRINT判断的，所做的是反射修改掉这个值，绕过检查即可。

验证Nexus 6可以使用，7.0以上机型都可以试一下

=======================================end============================================

Google AR SDK
=====================
Copyright (c) 2017 Google Inc.  All rights reserved.

[https://developers.google.com/ar/develop/java/getting-started](https://developers.google.com/ar/develop/java/getting-started)

Please note, we do not accept pull requests.
