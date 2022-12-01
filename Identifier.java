public class Identifier{
  
   /*método que determinar se um identificador de medicamento é válido ou não.
   /O identificador deve começar com uma letra (inicial da farmacêutica que o produz)
   e conter apenas letras ou dígitos. Além disso, deve ter entre 6 e 12 caracteres de comprimento”.*/

   public String validacaoID (String id){
       int comprimento = id.length();
       int numcaract = comprimento;
       char[] letra = null;
       
       if (comprimento >= 1)
       
       letra = id.substring(0,1).toCharArray();
       
       String saidaval = "ID válido";
       String saidainval = "ID inválido";
       if(comprimento>=6 && comprimento<=12){         
          
           if(Character.isLetter(letra[0])){
               for (char c : id.toCharArray()) {
                   if( Character.isLetter(c) || Character.isDigit(c)){
                       numcaract --;
                   }
                  
               }
               if(numcaract==0){
                   return saidaval;
               }
               else{
                   return saidainval;
               }
              
           }
           else{
               return saidainval;
           }
       }
           return saidainval;
      
   }

   public static void main (String[] args) {
      
       Identifier identifier = new Identifier();
       System.out.println(identifier.validacaoID("Pf435678"));
   }
}
