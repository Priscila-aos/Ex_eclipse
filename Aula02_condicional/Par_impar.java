����   < 5  'br/com/generation/condicional/Par_impar  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this )Lbr/com/generation/condicional/Par_impar; main ([Ljava/lang/String;)V  Entre com um número inteiro:
    javax/swing/JOptionPane   showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;
    java/lang/Integer   parseInt (Ljava/lang/String;)I  O número é PAR ! 	Atenção
  # $ % showMessageDialog <(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
 ' ) ( java/lang/System * + exit (I)V - O número é Impar args [Ljava/lang/String; numero I StackMapTable 
SourceFile Par_impar.java !               /     *� �    
                    	       �     /<� � <p�  � "� &� , � "� &�    
   6    
               !  &  '  *  .         / . /    - 0 1  2    � !  3    4