@.str.color.5 = private unnamed_addr constant [5 x i8] c"Cyan\00"
@.str.color.4 = private unnamed_addr constant [8 x i8] c"Magenta\00"
@.str.color.3 = private unnamed_addr constant [5 x i8] c"Azul\00"
@.str.color.2 = private unnamed_addr constant [6 x i8] c"Verde\00"
@.str.color.1 = private unnamed_addr constant [5 x i8] c"Rojo\00"
@.str.color.0 = private unnamed_addr constant [5 x i8] c"Azul\00"
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

@iter = common global i32 0, align 4
@avancei = common global i32 0, align 4
@reduccion = common global i32 0, align 4
@giro = common global i32 0, align 4
@i = common global i32 0, align 4
define i32 @main() {
entry:
  %t.time = call i32 @time(i32* null)
  call void @srand(i32 %t.time)
  store i32 30, i32* @iter, align 4
  store i32 150, i32* @avancei, align 4
  store i32 5, i32* @reduccion, align 4
  store i32 95, i32* @giro, align 4
  store i32 0, i32* @i, align 4
  %t0 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.pendown, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t0)
  call i32 @fflush(i8* null)
  %t1 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.0, i64 0, i64 0
  %t2 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t2, i8* %t1)
  call i32 @fflush(i8* null)
  br label %while.header.0
while.header.0:
  %t3 = load i32, i32* @i, align 4
  %t4 = load i32, i32* @iter, align 4
  %t5 = icmp slt i32 %t3, %t4
  %t6 = zext i1 %t5 to i32
  %t7 = icmp ne i32 %t6, 0
  br i1 %t7, label %while.body.1, label %while.exit.2
while.body.1:
  %t8 = alloca i32, align 4
  store i32 0, i32* %t8, align 4
  br label %loop.header.3
loop.header.3:
  %t9 = load i32, i32* %t8, align 4
  %t10 = icmp slt i32 %t9, 4
  br i1 %t10, label %loop.body.4, label %loop.exit.5
loop.body.4:
  %t11 = load i32, i32* @avancei, align 4
  %t12 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t12, i32 %t11)
  call i32 @fflush(i8* null)
  %t13 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t13, i32 90)
  call i32 @fflush(i8* null)
  %t14 = add nsw i32 %t9, 1
  store i32 %t14, i32* %t8, align 4
  br label %loop.header.3
loop.exit.5:
  %t15 = load i32, i32* @giro, align 4
  %t16 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t16, i32 %t15)
  call i32 @fflush(i8* null)
  %t17 = icmp eq i32 0, 0
  %t18 = zext i1 %t17 to i32
  %t19 = icmp ne i32 %t18, 0
  br i1 %t19, label %if.then.6, label %if.else.7
if.then.6:
  %t20 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.1, i64 0, i64 0
  %t21 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t21, i8* %t20)
  call i32 @fflush(i8* null)
  br label %if.end.8
if.else.7:
  %t22 = icmp eq i32 0, 1
  %t23 = zext i1 %t22 to i32
  %t24 = icmp ne i32 %t23, 0
  br i1 %t24, label %if.then.9, label %if.else.10
if.then.9:
  %t25 = getelementptr inbounds [6 x i8], [6 x i8]* @.str.color.2, i64 0, i64 0
  %t26 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t26, i8* %t25)
  call i32 @fflush(i8* null)
  br label %if.end.11
if.else.10:
  %t27 = icmp eq i32 0, 2
  %t28 = zext i1 %t27 to i32
  %t29 = icmp ne i32 %t28, 0
  br i1 %t29, label %if.then.12, label %if.else.13
if.then.12:
  %t30 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.3, i64 0, i64 0
  %t31 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t31, i8* %t30)
  call i32 @fflush(i8* null)
  br label %if.end.14
if.else.13:
  %t32 = icmp eq i32 0, 3
  %t33 = zext i1 %t32 to i32
  %t34 = icmp ne i32 %t33, 0
  br i1 %t34, label %if.then.15, label %if.else.16
if.then.15:
  %t35 = getelementptr inbounds [8 x i8], [8 x i8]* @.str.color.4, i64 0, i64 0
  %t36 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t36, i8* %t35)
  call i32 @fflush(i8* null)
  br label %if.end.17
if.else.16:
  %t37 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.5, i64 0, i64 0
  %t38 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t38, i8* %t37)
  call i32 @fflush(i8* null)
  br label %if.end.17
if.end.17:
  br label %if.end.14
if.end.14:
  br label %if.end.11
if.end.11:
  br label %if.end.8
if.end.8:
  %t39 = load i32, i32* @i, align 4
  %t40 = add nsw i32 %t39, 1
  store i32 %t40, i32* @i, align 4
  br label %while.header.0
while.exit.2:
  %t41 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.penup, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t41)
  call i32 @fflush(i8* null)
  %t42 = getelementptr inbounds [8 x i8], [8 x i8]* @.str.centro, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t42)
  call i32 @fflush(i8* null)
  ret i32 0
}
