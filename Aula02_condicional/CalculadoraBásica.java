����   < W  0br/com/generation/condicional/CalculadoraBásica  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 2Lbr/com/generation/condicional/CalculadoraBásica; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite o primeiro número: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D , Digite a operaçãoa: 
  . / 0 next ()Ljava/lang/String;
 2 4 3 java/lang/String 5 6 charAt (I)C 8 Digite o segundo número:  : java/lang/StringBuilder < 	Resultado
 9 >  &
 9 @ A B append (D)Ljava/lang/StringBuilder;
 9 D E 0 toString
  G H  close args [Ljava/lang/String; ler Ljava/util/Scanner; numero1 D numero2 	resultado operacao C StackMapTable J 
SourceFile CalculadoraBásica.java !               /     *� �    
                    	        	   f� Y� � L99� � !+� 'I� +� !+� -� 16� 7� !+� 'I+� 	(c9� � 9Y;� =� ?� C� !+� F�    
   6    	         &  0  8  =  D  J  a  e     >    f I J    [ K L   H M N   X O N   U P N  0 6 Q R  S    � J  T     U    V