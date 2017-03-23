#!/usr/bin/env python
# -*- coding: utf-8 -*-


#importation des modules 
from Tkinter import *
import tkMessageBox
import matplotlib.pyplot as plt
from tkFileDialog import *


#variables globales
global AFFICHERAP
global APPROPOS
global FILE
AFFICHERAP = True
APPROPOS = "Ce programme nous permet d'étudier un texte politique ....\n explication et image a inséter après"


def alert():
    """
    
    """
    if AFFICHERAP:
        messagebox.showinfo("Alerte", APPROPOS)
        afficerAp = False


def quitter():
    """
    
    """
    fenetre.destroy()


def graphe(t, n, d, e):
    """
    
    """
    name = n
    data = d
    explode = e

    l = list(map(int, data))
    total = sum(l)
    plt.pie(data, explode=explode, labels=name, autopct=lambda(p): '{:.0f}'.format(p * total / 100), startangle=90, shadow=True)
    plt.title(t)
    plt.axis('equal')
    plt.show()


def analyse():
    """
    
    """
    if FILE.get() == 'None':
        messagebox.showinfo("Alerte", "Aucun fichier importé!")
    elif value.get() == '':
        messagebox.showinfo("Alerte", "Aucune valeur entrée!")
    else:
        fichier = open(FILE.get(), "r")
        if checker.get() == 0:
            i = 0
            for ligne in fichier.readlines():
                if value.get() in ligne:
                    i += 1
                    titre, names, datas, explode = filtre(ligne)
                    graphe(titre, names, datas, explode)
            if i == 0:
                messagebox.showinfo("Alerte", "Vérifier l'orthographe du nom!")
        else:
            mot = value.get()
            i = 0
            parMot = []
            for ligne in fichier.readlines():
                if mot in ligne:
                    parMot.append(filtreParMot(mot, ligne))
                    i += 1
            if i == 0:
                messagebox.showinfo("Alerte", "Vérifier l'orthographe du mot!")
            else:
                names, datas, explode = traite(parMot)
                graphe(mot, names, datas, explode)


def traite(l):
    """
    
    """
    datas = []
    values = []
    explode = []
    for valeur in l:
        datas.append(valeur[0])
        values.append(valeur[1])
    for i in range(len(datas)):
        explode.append(0)
    return datas, values, explode


def filtreParMot(m, l):
    """
    
    """
    l = l[:-1]
    l = l.split(" ")
    nom = l[0]
    donnees = l[1:]
    for i in range(len(donnees)):
        if m in donnees[i]:
            valeurs = donnees[i].split(":")
            valeur = valeurs[1]
    return (nom, valeur)
    
    
def filtre(l):
    """
    
    """
    l = l[:-1]
    l = l.split(" ")
    titre = l[0]
    donnees = l[1:]
    res1 = []
    res2 = []
    explode = []
    for tmp in donnees:
        tmp2 = tmp.split(":")
        res1.append(tmp2[0])
        res2.append(tmp2[1])
    # ajouter 0 dans explode
    for i in range(len(res1)):
        explode.append(0)
    return titre, res1, res2, tuple(explode)


def filepath():
    """
    
    """
    filename = askopenfilename(title="Importer un fichier",filetypes=[('fichier texte','.txt')])   
    FILE.set(filename)
    

def explode0(l):
    for i in range(len(l)):
        l[i] = 0
    return tuple(l)




#fenetre principale
fenetre = Tk()
fenetre.title("Analayse de Texte Politique")
fenetre.resizable(width=False, height=False)

#menu
menubar = Menu(fenetre)

menu1 = Menu(menubar, tearoff=0)
menu1.add_command(label="Importer", command=filepath)
menu1.add_separator()
menu1.add_command(label="Quitter", command=quitter)
menubar.add_cascade(label="Fichier", menu=menu1)

menu3 = Menu(menubar, tearoff=0)
menu3.add_command(label="A propos", command=alert)
menubar.add_cascade(label="Aide", menu=menu3)

fenetre.config(menu=menubar)

#cadre principal
cadre = Frame(fenetre, borderwidth=1)
cadre.pack(padx=10, pady=10)

# entrée
text = Label(cadre, height=10, text="Nom du politique/Mot ")
value = StringVar()
FILE = StringVar()
FILE.set('None')
checker = IntVar()
entree = Entry(cadre, textvariable=value, width=30)
bouton = Button(cadre, text="Valider", command=analyse)
checkB = Checkbutton(cadre, text = "Réchercher en fonction du mot", variable = checker)
text.grid(row=0, column=0)
entree.grid(row=0, column=1)
bouton.grid(row=0, column=2)
checkB.grid(row=1,column=1)

fenetre.mainloop()
