@.str.color.3 = private unnamed_addr constant [5 x i8] c"Azul\00"
@.str.color.2 = private unnamed_addr constant [6 x i8] c"Negro\00"
@.str.color.1 = private unnamed_addr constant [9 x i8] c"Amarillo\00"
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

define i32 @main() {
entry:
  %t.time = call i32 @time(i32* null)
  call void @srand(i32 %t.time)
  %t0 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.pendown, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t0)
  call i32 @fflush(i8* null)
  %t1 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.0, i64 0, i64 0
  %t2 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t2, i8* %t1)
  call i32 @fflush(i8* null)
  %t3 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t3, i32 50)
  call i32 @fflush(i8* null)
  %t4 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t4, i32 90)
  call i32 @fflush(i8* null)
  %t5 = getelementptr inbounds [9 x i8], [9 x i8]* @.str.color.1, i64 0, i64 0
  %t6 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t6, i8* %t5)
  call i32 @fflush(i8* null)
  %t7 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t7, i32 50)
  call i32 @fflush(i8* null)
  %t8 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t8, i32 90)
  call i32 @fflush(i8* null)
  %t9 = getelementptr inbounds [6 x i8], [6 x i8]* @.str.color.2, i64 0, i64 0
  %t10 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t10, i8* %t9)
  call i32 @fflush(i8* null)
  %t11 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t11, i32 50)
  call i32 @fflush(i8* null)
  %t12 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t12, i32 90)
  call i32 @fflush(i8* null)
  %t13 = getelementptr inbounds [5 x i8], [5 x i8]* @.str.color.3, i64 0, i64 0
  %t14 = getelementptr inbounds [10 x i8], [10 x i8]* @.str.poncolor, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t14, i8* %t13)
  call i32 @fflush(i8* null)
  %t15 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t15, i32 50)
  call i32 @fflush(i8* null)
  %t16 = getelementptr inbounds [16 x i8], [16 x i8]* @.str.giraderecha, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t16, i32 90)
  call i32 @fflush(i8* null)
  %t17 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.penup, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t17)
  call i32 @fflush(i8* null)
  ret i32 0
}
