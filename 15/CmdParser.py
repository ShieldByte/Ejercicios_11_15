# Generated from Cmd.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,39,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,3,0,13,
        8,0,5,0,15,8,0,10,0,12,0,18,9,0,1,0,1,0,1,1,3,1,23,8,1,1,1,1,1,1,
        1,5,1,28,8,1,10,1,12,1,31,9,1,1,2,1,2,1,3,1,3,1,4,1,4,1,4,0,0,5,
        0,2,4,6,8,0,3,1,0,1,8,1,0,10,11,1,0,12,18,38,0,16,1,0,0,0,2,22,1,
        0,0,0,4,32,1,0,0,0,6,34,1,0,0,0,8,36,1,0,0,0,10,12,3,2,1,0,11,13,
        5,19,0,0,12,11,1,0,0,0,12,13,1,0,0,0,13,15,1,0,0,0,14,10,1,0,0,0,
        15,18,1,0,0,0,16,14,1,0,0,0,16,17,1,0,0,0,17,19,1,0,0,0,18,16,1,
        0,0,0,19,20,5,0,0,1,20,1,1,0,0,0,21,23,5,9,0,0,22,21,1,0,0,0,22,
        23,1,0,0,0,23,24,1,0,0,0,24,29,3,4,2,0,25,28,3,8,4,0,26,28,3,6,3,
        0,27,25,1,0,0,0,27,26,1,0,0,0,28,31,1,0,0,0,29,27,1,0,0,0,29,30,
        1,0,0,0,30,3,1,0,0,0,31,29,1,0,0,0,32,33,7,0,0,0,33,5,1,0,0,0,34,
        35,7,1,0,0,35,7,1,0,0,0,36,37,7,2,0,0,37,9,1,0,0,0,5,12,16,22,27,
        29
    ]

class CmdParser ( Parser ):

    grammarFileName = "Cmd.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'nmap'", "'ss'", "'tcpdump'", "'curl'", 
                     "'dig'", "'journalctl'", "'grep'", "'ufw'", "'sudo'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "';'" ]

    symbolicNames = [ "<INVALID>", "NMAP", "SS", "TCPDUMP", "CURL", "DIG", 
                      "JOURNALCTL", "GREP", "UFW", "SUDO", "OPCION_CORTA", 
                      "OPCION_LARGA", "IP", "CIDR", "RUTA", "DOMINIO", "TEXTO", 
                      "CADENA", "PALABRA_CLAVE", "PUNTO_COMA", "WS" ]

    RULE_root = 0
    RULE_lineaComando = 1
    RULE_comando = 2
    RULE_opcion = 3
    RULE_argumento = 4

    ruleNames =  [ "root", "lineaComando", "comando", "opcion", "argumento" ]

    EOF = Token.EOF
    NMAP=1
    SS=2
    TCPDUMP=3
    CURL=4
    DIG=5
    JOURNALCTL=6
    GREP=7
    UFW=8
    SUDO=9
    OPCION_CORTA=10
    OPCION_LARGA=11
    IP=12
    CIDR=13
    RUTA=14
    DOMINIO=15
    TEXTO=16
    CADENA=17
    PALABRA_CLAVE=18
    PUNTO_COMA=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(CmdParser.EOF, 0)

        def lineaComando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CmdParser.LineaComandoContext)
            else:
                return self.getTypedRuleContext(CmdParser.LineaComandoContext,i)


        def PUNTO_COMA(self, i:int=None):
            if i is None:
                return self.getTokens(CmdParser.PUNTO_COMA)
            else:
                return self.getToken(CmdParser.PUNTO_COMA, i)

        def getRuleIndex(self):
            return CmdParser.RULE_root

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRoot" ):
                listener.enterRoot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRoot" ):
                listener.exitRoot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = CmdParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1022) != 0):
                self.state = 10
                self.lineaComando()
                self.state = 12
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==19:
                    self.state = 11
                    self.match(CmdParser.PUNTO_COMA)


                self.state = 18
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 19
            self.match(CmdParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LineaComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comando(self):
            return self.getTypedRuleContext(CmdParser.ComandoContext,0)


        def SUDO(self):
            return self.getToken(CmdParser.SUDO, 0)

        def argumento(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CmdParser.ArgumentoContext)
            else:
                return self.getTypedRuleContext(CmdParser.ArgumentoContext,i)


        def opcion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CmdParser.OpcionContext)
            else:
                return self.getTypedRuleContext(CmdParser.OpcionContext,i)


        def getRuleIndex(self):
            return CmdParser.RULE_lineaComando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLineaComando" ):
                listener.enterLineaComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLineaComando" ):
                listener.exitLineaComando(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLineaComando" ):
                return visitor.visitLineaComando(self)
            else:
                return visitor.visitChildren(self)




    def lineaComando(self):

        localctx = CmdParser.LineaComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_lineaComando)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==9:
                self.state = 21
                self.match(CmdParser.SUDO)


            self.state = 24
            self.comando()
            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 523264) != 0):
                self.state = 27
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [12, 13, 14, 15, 16, 17, 18]:
                    self.state = 25
                    self.argumento()
                    pass
                elif token in [10, 11]:
                    self.state = 26
                    self.opcion()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NMAP(self):
            return self.getToken(CmdParser.NMAP, 0)

        def SS(self):
            return self.getToken(CmdParser.SS, 0)

        def TCPDUMP(self):
            return self.getToken(CmdParser.TCPDUMP, 0)

        def CURL(self):
            return self.getToken(CmdParser.CURL, 0)

        def DIG(self):
            return self.getToken(CmdParser.DIG, 0)

        def JOURNALCTL(self):
            return self.getToken(CmdParser.JOURNALCTL, 0)

        def GREP(self):
            return self.getToken(CmdParser.GREP, 0)

        def UFW(self):
            return self.getToken(CmdParser.UFW, 0)

        def getRuleIndex(self):
            return CmdParser.RULE_comando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando" ):
                listener.enterComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando" ):
                listener.exitComando(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando" ):
                return visitor.visitComando(self)
            else:
                return visitor.visitChildren(self)




    def comando(self):

        localctx = CmdParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_comando)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 510) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OpcionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPCION_CORTA(self):
            return self.getToken(CmdParser.OPCION_CORTA, 0)

        def OPCION_LARGA(self):
            return self.getToken(CmdParser.OPCION_LARGA, 0)

        def getRuleIndex(self):
            return CmdParser.RULE_opcion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpcion" ):
                listener.enterOpcion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpcion" ):
                listener.exitOpcion(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpcion" ):
                return visitor.visitOpcion(self)
            else:
                return visitor.visitChildren(self)




    def opcion(self):

        localctx = CmdParser.OpcionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_opcion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            _la = self._input.LA(1)
            if not(_la==10 or _la==11):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TEXTO(self):
            return self.getToken(CmdParser.TEXTO, 0)

        def CADENA(self):
            return self.getToken(CmdParser.CADENA, 0)

        def RUTA(self):
            return self.getToken(CmdParser.RUTA, 0)

        def IP(self):
            return self.getToken(CmdParser.IP, 0)

        def CIDR(self):
            return self.getToken(CmdParser.CIDR, 0)

        def DOMINIO(self):
            return self.getToken(CmdParser.DOMINIO, 0)

        def PALABRA_CLAVE(self):
            return self.getToken(CmdParser.PALABRA_CLAVE, 0)

        def getRuleIndex(self):
            return CmdParser.RULE_argumento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgumento" ):
                listener.enterArgumento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgumento" ):
                listener.exitArgumento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgumento" ):
                return visitor.visitArgumento(self)
            else:
                return visitor.visitChildren(self)




    def argumento(self):

        localctx = CmdParser.ArgumentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_argumento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 520192) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





