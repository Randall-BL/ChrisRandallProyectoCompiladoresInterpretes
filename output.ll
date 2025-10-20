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

@contador = common global i32 0, align 4
@limite = common global i32 0, align 4
define i32 @main() {
entry:
  %t.time = call i32 @time(i32* null)
  call void @srand(i32 %t.time)
  store i32 0, i32* @contador, align 4
  store i32 5, i32* @limite, align 4
  br label %while.header.0
while.header.0:
  %t0 = load i32, i32* @contador, align 4
  %t1 = load i32, i32* @limite, align 4
  %t2 = icmp slt i32 %t0, %t1
  %t3 = zext i1 %t2 to i32
  %t4 = icmp ne i32 %t3, 0
  br i1 %t4, label %while.body.1, label %while.exit.2
while.body.1:
  %t5 = getelementptr inbounds [11 x i8], [11 x i8]* @.str.avanza, i64 0, i64 0
  call i32 (i8*, ...) @printf(i8* %t5, i32 10)
  call i32 @fflush(i8* null)
  br label %while.header.0
while.exit.2:
  ret i32 0
}
