����   < [  /br/com/generation/condicional/ExemploSwitchCase  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 1Lbr/com/generation/condicional/ExemploSwitchCase; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Escreva uma letra entre a e d: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String;
 , . - java/lang/String / 0 hashCode ()I 2 A
 , 4 5 6 equals (Ljava/lang/Object;)Z 8 B : C < D > a @ b B c D d F Ana H Bruno J Carol L Dri N Operação Inválida
  P Q  close args [Ljava/lang/String; entrada Ljava/util/Scanner; letra Ljava/lang/String; StackMapTable 
SourceFile ExemploSwitchCase.java !               /     *� �    
                    	      �    � Y� � L� � !+� 'M,YN� +�    �      A   J   B   V   C   b   D   n   a   z   b   �   c   �   d   �-1� 3� Z� �-7� 3� Y� w-9� 3� X� k-;� 3� W� _-=� 3� *� S-?� 3� )� G-A� 3� (� ;-C� 3� '� /� E� !� ,� G� !� !� I� !� � K� !� � M� !+� O�    
   >    	       �  �  �  �  �  �  �  �  �  � "  %         R S    � T U   � V W  X    � h  , ,



�   Y    Z