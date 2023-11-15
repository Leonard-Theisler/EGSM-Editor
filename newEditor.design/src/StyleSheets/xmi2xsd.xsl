<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
	<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" attributeFormDefault="unqualified" elementFormDefault="qualified">
	<xsl:apply-templates select="//event"/>
	</xs:schema>
</xsl:template> 

<xsl:template match="//event">
  <xsl:if test="substring(@id,string-length(@id)-1,2)!='_l'">
  <xs:element>
    <xsl:for-each select="@id">
        <xsl:attribute name="name">
		  <xsl:choose>
			<xsl:when test="substring(.,string-length()-1,2)='_e'">
				<xsl:value-of select="substring(.,1,string-length()-2)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="."/>
			</xsl:otherwise>
		  </xsl:choose>
        </xsl:attribute>
    </xsl:for-each>
	
	<xs:complexType>
		<xs:attribute name="timestamp" type="xs:dateTime" use="required"/>
		<xsl:if test="substring(@id,string-length(@id)-1,2)='_e'">
		  <xs:attribute name="status" type="xs:string" use="optional"/>
		</xsl:if>
	</xs:complexType>
  </xs:element>
  </xsl:if>
</xsl:template>

</xsl:stylesheet>