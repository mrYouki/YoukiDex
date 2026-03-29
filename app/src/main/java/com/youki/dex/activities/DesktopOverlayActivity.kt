package com.youki.dex.activities

/**
 * DesktopOverlayActivity — نفس شاشة سطح المكتب بالضبط، لكن بدون HOME category.
 *
 * السبب: LauncherActivity مسجل كـ HOME activity، فـ Samsung تطرده فور ما يطلع
 * من اختصار عادي على الشاشة الرئيسية. هذه Activity وارثة لكل كود LauncherActivity
 * لكنها في المانيفست بدون intent-filter HOME — فالنظام يعاملها كـ activity عادية
 * ولا يتدخل فيها.
 *
 * يُستخدم للاختصار على الشاشة الرئيسية فقط.
 */
class DesktopOverlayActivity : LauncherActivity()
