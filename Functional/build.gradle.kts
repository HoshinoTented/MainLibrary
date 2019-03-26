import org.hoshino9.gradle.generator.*
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val compileKotlin = tasks["compileKotlin"] as KotlinCompile
val genCurring = task<CurringGenerator>("genCurring")
val genUncurring = task<UncurringGenerator>("genUncurring")
val genCurriedType = task<CurriedTypeGenerator>("genCurriedType")
val genUncurriedType = task<UncurriedTypeGenerator>("genUncurriedType")

compileKotlin.dependsOn(genCurring, genUncurring, genCurriedType, genUncurriedType)