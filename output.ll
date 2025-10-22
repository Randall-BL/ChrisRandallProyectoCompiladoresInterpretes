@.str.color.4 = private unnamed_addr constant [6 x i8] c"Verde\00"
@.str.color.3 = private unnamed_addr constant [9 x i8] c"Amarillo\00"
@.str.color.2 = private unnamed_addr constant [5 x i8] c"Rojo\00"
@.str.color.1 = private unnamed_addr constant [5 x i8] c"Azul\00"
@.str.color.0 = private unnamed_addr constant [6 x i8] c"Verde\00"
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

@puntas = common global i32 0, align 4
@lado = common global i32 0, align 4
@rotacion = common global i32 0, align 4
@estrellas = common global i32 0, align 4
@angulo = common global i32 0, align 4
@angulo2 = common global i32 0, align 4
@i = common global i32 0, align 4
define i32 @main() {
entry:
  %t.time = call i32 @time(i32* null)
  call void @srand(i32 %t.time)
  store i32 5, i32* @puntas, align 4
  store i32 120, i32* @lado, align 4
  store i32 144, i32* @rotacion, align 4
  store i32 20, i32* @estrellas, align 4
  store i32 360, i32* @angulo, align 4
  %t0 = load i32, i32* @angulo, align 4
  %t1 = load i32, i32* @estrellas, align 4
  %t2 = sdiv i32 %t0, %t1
  store i32 %t2, i32* @angulo2, align 4
  store i32 0, i32* @i, align 4
  %t3 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.pendown, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t3)
  call i32 @fflush(i8* null)
  %t4 = getelementptr inbounds [6 x i8], [6 x i8]* @.str.color.0, i64 0, i64 0
  %t5 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t5, i8* %t4)
  call i32 @fflush(i8* null)
  br label %while.header.0
while.header.0:
  %t6 = load i32, i32* @i, align 4
  %t7 = load i32, i32* @estrellas, align 4
  %t8 = icmp slt i32 %t6, %t7
  %t9 = zext i1 %t8 to i32
  %t10 = icmp ne i32 %t9, 0
  br i1 %t10, label %while.body.1, label %while.exit.2
while.body.1:
  %t11 = alloca i32, align 4
  store i32 0, i32* %t11, align 4
  %t12 = load i32, i32* @puntas, align 4
  br label %loop.header.3
loop.header.3:
  %t13 = load i32, i32* %t11, align 4
  %t14 = icmp slt i32 %t13, %t12
  br i1 %t14, label %loop.body.4, label %loop.exit.5
loop.body.4:
  %t15 = load i32, i32* @lado, align 4
  %t16 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t16, i32 %t15)
  call i32 @fflush(i8* null)
  %t17 = load i32, i32* @rotacion, align 4
  %t18 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t18, i32 %t17)
  call i32 @fflush(i8* null)
  %t19 = add nsw i32 %t13, 1
  store i32 %t19, i32* %t11, align 4
  br label %loop.header.3
loop.exit.5:
  %t20 = load i32, i32* @angulo2, align 4
  %t21 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t21, i32 %t20)
  call i32 @fflush(i8* null)
  %t22 = icmp eq i32 0, 0
  %t23 = zext i1 %t22 to i32
  %t24 = icmp ne i32 %t23, 0
  br i1 %t24, label %if.then.6, label %if.end.7
if.then.6:
  %t25 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.1, i64 0, i64 0
  %t26 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t26, i8* %t25)
  call i32 @fflush(i8* null)
  br label %if.end.7
if.end.7:
  %t27 = icmp eq i32 0, 1
  %t28 = zext i1 %t27 to i32
  %t29 = icmp ne i32 %t28, 0
  br i1 %t29, label %if.then.8, label %if.end.9
if.then.8:
  %t30 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.2, i64 0, i64 0
  %t31 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t31, i8* %t30)
  call i32 @fflush(i8* null)
  br label %if.end.9
if.end.9:
  %t32 = icmp eq i32 0, 2
  %t33 = zext i1 %t32 to i32
  %t34 = icmp ne i32 %t33, 0
  br i1 %t34, label %if.then.10, label %if.end.11
if.then.10:
  %t35 = getelementptr inbounds [9 x i8], [9 x i8]* @.str.color.3, i64 0, i64 0
  %t36 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t36, i8* %t35)
  call i32 @fflush(i8* null)
  br label %if.end.11
if.end.11:
  %t37 = icmp eq i32 0, 3
  %t38 = zext i1 %t37 to i32
  %t39 = icmp ne i32 %t38, 0
  br i1 %t39, label %if.then.12, label %if.end.13
if.then.12:
  %t40 = getelementptr inbounds [6 x i8], [6 x i8]* @.str.color.4, i64 0, i64 0
  %t41 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t41, i8* %t40)
  call i32 @fflush(i8* null)
  br label %if.end.13
if.end.13:
  %t42 = load i32, i32* @i, align 4
  %t43 = add nsw i32 %t42, 1
  store i32 %t43, i32* @i, align 4
  br label %while.header.0
while.exit.2:
  %t44 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.penup, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t44)
  call i32 @fflush(i8* null)
  %t45 = getelementptr inbounds [8 x i8], [8 x i8]* @.str.centro, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t45)
  call i32 @fflush(i8* null)
  ret i32 0
}
