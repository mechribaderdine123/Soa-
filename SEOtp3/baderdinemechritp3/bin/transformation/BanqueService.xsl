<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:param name="BanqueServiceout" select="'out.xml'"/>
<xsl:output method="xml" indent="yes" omit-xml-declaration="no" encoding="UTF-8" media-type="application/xml" doctype-public="-//W3C//DTD XHTML 1.0 Strict//EN" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" />


    <!-- Définition de la variable "totalSolde" pour stocker la somme totale des soldes de tous les comptes -->
    <xsl:variable name="totalSolde">
        <xsl:value-of select="sum(comptes/getComptes/solde)"/>
    </xsl:variable>

    <!-- Définition de la variable "totalSoldeFiltré" pour stocker la somme totale des soldes des comptes filtrés -->
    <xsl:variable name="totalSoldeFiltré">
        <xsl:value-of select="sum(comptes/getComptes[year-from-date(dateCreation) > 2000]/solde)"/>
    </xsl:variable>

    <!-- Template pour la racine -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Liste des Comptes</title>
            </head>
            <body>
                <h1>Liste des Comptes</h1>

                <!-- Premier tableau pour afficher tous les comptes -->
                <table border="1">
                    <tr>
                        <th>Code</th>
                        <th>Solde</th>
                        <th>Date de Création</th>
                    </tr>
                    <xsl:apply-templates select="comptes/getComptes"/>
                </table>

                <!-- Deuxième tableau pour afficher les comptes filtrés (après l'année 2000) -->
                <h2>Comptes après 2000</h2>
                <table border="1">
                    <tr>
                        <th>Code</th>
                        <th>Solde</th>
                        <th>Date de Création</th>
                    </tr>
                    <xsl:apply-templates select="comptes/getComptes[year-from-date(dateCreation) > 2000]"/>
                </table>

                <!-- Affichage de la somme totale des soldes des comptes filtrés après le deuxième tableau -->
                <p>Somme totale des soldes des comptes filtrés : <xsl:value-of select="$totalSoldeFiltré"/></p>
            </body>
        </html>
    </xsl:template>

    <!-- Template pour chaque compte -->
    <xsl:template match="getComptes">
        <tr>
            <td><xsl:value-of select="code"/></td>
            <td><xsl:value-of select="solde"/></td>
            <td><xsl:value-of select="dateCreation"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>
