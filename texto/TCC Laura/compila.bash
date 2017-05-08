#!/bin/bash
n="TCC"
pdflatex $n.tex
bibtex $n.aux
pdflatex $n.tex
pdflatex $n.tex
rm $n.log $n.toc $n.aux $n.bbl $n.blg $n.lof $n.lot

