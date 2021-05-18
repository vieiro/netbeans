#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=clang
CCC=clang++
CXX=clang++
FC=gfortran
AS=as

# Macros
CND_PLATFORM=CLang-Linux
CND_DLIB_EXT=so
CND_CONF=LINUX
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/CXIndex.o \
	${OBJECTDIR}/CXTranslationUnit.o \
	${OBJECTDIR}/CXUnsavedFileList.o \
	${OBJECTDIR}/nblibclang.o


# C Compiler Flags
CFLAGS=

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=-Wl,-rpath,'/lib/llvm-7/lib' -lclang

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libnblibclang.${CND_DLIB_EXT}

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libnblibclang.${CND_DLIB_EXT}: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	${LINK.c} -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libnblibclang.${CND_DLIB_EXT} ${OBJECTFILES} ${LDLIBSOPTIONS} -shared -fPIC

${OBJECTDIR}/CXIndex.o: CXIndex.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -Wall -I/lib/llvm-7/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include/linux -fPIC  -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/CXIndex.o CXIndex.c

${OBJECTDIR}/CXTranslationUnit.o: CXTranslationUnit.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -Wall -I/lib/llvm-7/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include/linux -fPIC  -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/CXTranslationUnit.o CXTranslationUnit.c

${OBJECTDIR}/CXUnsavedFileList.o: CXUnsavedFileList.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -Wall -I/lib/llvm-7/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include/linux -fPIC  -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/CXUnsavedFileList.o CXUnsavedFileList.c

${OBJECTDIR}/nblibclang.o: nblibclang.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -Wall -I/lib/llvm-7/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include -I/home/antonio/SOFTWARE/jdk8u232-b09/include/linux -fPIC  -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/nblibclang.o nblibclang.c

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
