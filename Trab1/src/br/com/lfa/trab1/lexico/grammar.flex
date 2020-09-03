package br.com.lfa.trab1.lexico;
import java_cup.runtime.Symbol;
import br.com.lfa.trab1.sintatico.Sym;
%%
%cup
%public
%unicode
%class Lexico
%line
%column

%{
    private Symbol symbol(int type, Object o){
      return new Symbol(type, o);
    }
    private Symbol symbol(int type){
          return new Symbol(type);
        }
%}

a = a
b = b
%%

<YYINITIAL>{
	{a} {return symbol(Sym.a,yytext());}
	{b} {return symbol(Sym.b,yytext());}
}

<<EOF>> {return symbol(Sym.EOF);}

[^] {throw new Error("Palavra não reconhecida");}