@.str.color.2 = private unnamed_addr constant [6 x i8] c"Negro\00"
@.str.color.1 = private unnamed_addr constant [5 x i8] c"Azul\00"
@.str.color.0 = private unnamed_addr constant [5 x i8] c"Rojo\00"
@.str.avanza = private unnamed_addr constant [11 x i8] c"AVANZA:%d\0A\00"
@.str.retrocede = private unnamed_addr constant [14 x i8] c"RETROCEDE:%d\0A\00"
@.str.giraderecha = private unnamed_addr constant [16 x i8] c"GIRADERECHA:%d\0A\00"
@.str.giraizquierda = private unnamed_addr constant [18 x i8] c"GIRAIZQUIERDA:%d\0A\00"
@.str.poncolor = private unnamed_addr constant [10 x i8] c"COLOR:%s\0A\00"
@.str.penup = private unnamed_addr constant [11 x i8] c"SUBELAPIZ\0A\00"
@.str.pendown = private unnamed_addr constant [11 x i8] c"BAJALAPIZ\0A\00"
@.str.ponpos = private unnamed_addr constant [14 x i8] c"PONPOS:%d:%d\0A\00"
@.str.ponrumbo = private unnamed_addr constant [13 x i8] c"PONRUMBO:%d\0A\00"
@.str.espera = private unnamed_addr constant [11 x i8] c"ESPERA:%d\0A\00"
@.str.centro = private unnamed_addr constant [8 x i8] c"CENTRO\0A\00"
@.str.ocultatortuga = private unnamed_addr constant [15 x i8] c"OCULTATORTUGA\0A\00"
declare i32 @printf(i8*, ...)

declare i32 @pow(i32, i32)

declare i32 @rand()

declare void @srand(i32)

declare i32 @time(i32*)

declare i32 @fflush(i8*)

@resultado1 = common global i32 0, align 4
@resultado2 = common global i32 0, align 4
@esMayor = common global i32 0, align 4
@condA = common global i32 0, align 4
@condB = common global i32 0, align 4
@resultadoY = common global i32 0, align 4
@condC = common global i32 0, align 4
@condD = common global i32 0, align 4
@resultadoO = common global i32 0, align 4
@dif1 = common global i32 0, align 4
@aleatorio1 = common global i32 0, align 4
define i32 @main() {
entry:
  %t.time = call i32 @time(i32* null)
  call void @srand(i32 %t.time)
  %t0 = icmp eq i32 10, 10
  %t1 = zext i1 %t0 to i32
  store i32 %t1, i32* @resultado1, align 4
  %t2 = load i32, i32* @resultado1, align 4
  %t3 = icmp eq i32 %t2, 1
  %t4 = zext i1 %t3 to i32
  %t5 = icmp ne i32 %t4, 0
  br i1 %t5, label %if.then.0, label %if.end.1
if.then.0:
  %t6 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t6, i32 50)
  call i32 @fflush(i8* null)
  %t7 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.0, i64 0, i64 0
  %t8 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t8, i8* %t7)
  call i32 @fflush(i8* null)
  br label %if.end.1
if.end.1:
  %t9 = icmp eq i32 5, 3
  %t10 = zext i1 %t9 to i32
  store i32 %t10, i32* @resultado2, align 4
  %t11 = load i32, i32* @resultado2, align 4
  %t12 = icmp eq i32 %t11, 0
  %t13 = zext i1 %t12 to i32
  %t14 = icmp ne i32 %t13, 0
  br i1 %t14, label %if.then.2, label %if.end.3
if.then.2:
  %t15 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t15, i32 45)
  call i32 @fflush(i8* null)
  br label %if.end.3
if.end.3:
  %t16 = icmp sgt i32 20, 10
  %t17 = zext i1 %t16 to i32
  store i32 %t17, i32* @esMayor, align 4
  %t18 = load i32, i32* @esMayor, align 4
  %t19 = icmp eq i32 %t18, 1
  %t20 = zext i1 %t19 to i32
  %t21 = icmp ne i32 %t20, 0
  br i1 %t21, label %if.then.4, label %if.end.5
if.then.4:
  %t22 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t22, i32 40)
  call i32 @fflush(i8* null)
  %t23 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.1, i64 0, i64 0
  %t24 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t24, i8* %t23)
  call i32 @fflush(i8* null)
  br label %if.end.5
if.end.5:
  %t25 = icmp sgt i32 15, 10
  %t26 = zext i1 %t25 to i32
  store i32 %t26, i32* @condA, align 4
  %t27 = icmp slt i32 15, 20
  %t28 = zext i1 %t27 to i32
  store i32 %t28, i32* @condB, align 4
  %t29 = load i32, i32* @condA, align 4
  %t30 = load i32, i32* @condB, align 4
  %t31 = icmp ne i32 %t29, 0
  %t32 = icmp ne i32 %t30, 0
  %t33 = and i1 %t31, %t32
  %t34 = zext i1 %t33 to i32
  store i32 %t34, i32* @resultadoY, align 4
  %t35 = load i32, i32* @resultadoY, align 4
  %t36 = icmp eq i32 %t35, 1
  %t37 = zext i1 %t36 to i32
  %t38 = icmp ne i32 %t37, 0
  br i1 %t38, label %if.then.6, label %if.end.7
if.then.6:
  %t39 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t39, i32 60)
  call i32 @fflush(i8* null)
  %t40 = getelementptr inbounds [6 x i8], [6 x i8]* @.str.color.2, i64 0, i64 0
  %t41 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t41, i8* %t40)
  call i32 @fflush(i8* null)
  br label %if.end.7
if.end.7:
  %t42 = icmp eq i32 5, 5
  %t43 = zext i1 %t42 to i32
  store i32 %t43, i32* @condC, align 4
  %t44 = icmp eq i32 3, 7
  %t45 = zext i1 %t44 to i32
  store i32 %t45, i32* @condD, align 4
  %t46 = load i32, i32* @condC, align 4
  %t47 = load i32, i32* @condD, align 4
  %t48 = icmp ne i32 %t46, 0
  %t49 = icmp ne i32 %t47, 0
  %t50 = or i1 %t48, %t49
  %t51 = zext i1 %t50 to i32
  store i32 %t51, i32* @resultadoO, align 4
  %t52 = load i32, i32* @resultadoO, align 4
  %t53 = icmp eq i32 %t52, 1
  %t54 = zext i1 %t53 to i32
  %t55 = icmp ne i32 %t54, 0
  br i1 %t55, label %if.then.8, label %if.end.9
if.then.8:
  %t56 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t56, i32 120)
  call i32 @fflush(i8* null)
  br label %if.end.9
if.end.9:
  %t57 = sub nsw i32 100, 30
  store i32 %t57, i32* @dif1, align 4
  %t58 = call i32 @rand()
  %t59 = srem i32 %t58, 360
  store i32 %t59, i32* @aleatorio1, align 4
  ret i32 0
}
