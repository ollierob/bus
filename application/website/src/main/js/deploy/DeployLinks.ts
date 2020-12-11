export function deployProjectsLink() {
    return deployPrefix() + "#/projects";
}

export function deployProjectCreateLink() {
    return deployPrefix() + "#/createProject";
}

export function deploySourcesLink() {
    return deployPrefix() + "#/sources";
}

export function deploySourceRepositoriesLink() {
    return deployPrefix() + "#/repositories";
}

export function deployBuildServersLink() {
    return deployPrefix() + "#/buildServers";
}

export function deployTargetsLink() {
    return deployPrefix() + "#/targets";
}

function deployPrefix() {
    try {
        const current = window.location.pathname;
        if (current && !current.startsWith("/deploy")) return "/deploy";
    } catch (e) {
    }
    return "";
}